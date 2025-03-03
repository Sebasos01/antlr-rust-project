#![feature(try_blocks)]

fn main() -> Result<(), Box<dyn std::error::Error>> {
    let total = try {
        let a = 10;
        let b = 20;
        a + b
    };

    println!("The total is: {}", total);
    Ok(())
}
