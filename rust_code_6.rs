extern crate proc_macro;
use proc_macro::TokenStream;
use quote::quote;
use syn::{parse_macro_input, ItemFn};

/// The `trace` attribute macro instruments a function.
/// When applied, it prints a message upon entering and exiting the function.
#[proc_macro_attribute]
pub fn trace(_attr: TokenStream, item: TokenStream) -> TokenStream {
    // Parse the input tokens into a syntax tree representing a function.
    let input = parse_macro_input!(item as ItemFn);
    
    // Extract the function’s identifier, visibility, signature, and body.
    let name = &input.sig.ident;
    let vis = &input.vis;
    let sig = &input.sig;
    let block = &input.block;
    
    // Generate new code that wraps the original function body.
    // It prints messages before and after executing the original body.
    let gen = quote! {
        #vis #sig {
            println!("Entering function: {}", stringify!(#name));
            let result = (|| #block)();
            println!("Exiting function: {}", stringify!(#name));
            result
        }
    };

    // Convert the generated code back into a TokenStream.
    gen.into()
}
