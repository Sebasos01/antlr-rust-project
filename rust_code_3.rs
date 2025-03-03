#[cfg(target_os = "linux")]
fn platform_function() {
    println!("Running on Linux!");
}

#[cfg(target_os = "windows")]
fn platform_function() {
    println!("Running on Windows!");
}

fn main() {
    platform_function();
}
