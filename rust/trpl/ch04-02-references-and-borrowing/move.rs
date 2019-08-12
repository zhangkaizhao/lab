// fn dangle() -> &String {
//     // s is a new string.
//     let s = String::from("hello");
//
//     // s will be freed after s goes out of current scope unless it is moved out.
//     // so we can't just return a reference to it.
//
//     &s
// }

fn no_dangle() -> String {
    let s = String::from("hello");

    // The owership of s will be moved out after s goes out of current scope,
    // and nothing is deallocated.

    s
}

fn main() {
    // let reference_to_nothing = dangle();

    let reference_to_nothing = no_dangle();

    println!("{}", reference_to_nothing);
}
