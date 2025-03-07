#[repr(C)]
union union {
    int_val: u32,
    float_val: f32,
}

fn main() {
    let u = union { int_val: 42 };
    unsafe {
        println!("{}", u.int_val);
    }
}