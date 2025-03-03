struct Person {
    name: String,
    age: u32,
}

impl Person {
    fn new(name: &str, age: u32) -> Self {
        Person { name: name.to_string(), age }
    }
    
    fn greet(&self) {
        println!("Hello, my name is {} and I am {} years old.", self.name, self.age);
    }
}

fn main() {
    let fact = compute(5);
    println!("Factorial of 5 is: {}", fact);
    
    let person = Person::new("Alice", 30);
    person.greet();
    
    for i in 0..5 {
        println!("Iteration: {}", i);
    }
}

main();