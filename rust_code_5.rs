#![allow(internal_features)]
#![feature(no_core, lang_items, rustc_attrs, decl_macro)]
#![no_std]
#![no_core]
#![no_main]

#[rustc_builtin_macro]
pub macro asm("assembly template", $(operands,)* $(options($(option),*))?) {
    /* compiler built-in */
}

mod lang {
    #[lang = "sized"]
    trait Sized {} // 0 implementations
    #[lang = "copy"]
    trait Copy {} // 0 implementations
}

#[unsafe(no_mangle)]
fn _libc_start_main(_argc: i32, _argv: *const *const u8) -> u8 {
    unsafe {
        asm!(
            "mov rax, 1",        // sys_write
            "mov rdi, 1",        // stdout
            "lea rsi, [rip+2f]", // message pointer
            "mov rdx, 13",       // length
            "syscall",

            "mov rax, 60",       // sys_exit
            "xor rdi, rdi",      // status 0
            "syscall",
            ".align 8",
            "2:",
            ".ascii \"Hello world!\\n\"",
        );
    }
    0
}

#[unsafe(no_mangle)]
fn main() -> u8 { 
    0 
}
