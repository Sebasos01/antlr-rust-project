fn create_dangling_pointer() -> *const i32 {
    let local = 42;
    // Return a pointer to a local variable; once this function returns, `local` no longer exists.
    &local as *const i32
}

fn main() {
    let ptr = create_dangling_pointer();
    unsafe {
        // Dereferencing a dangling pointer leads to undefined behavior.
        println!("Dangling pointer value: {}", *ptr);
    }
}
