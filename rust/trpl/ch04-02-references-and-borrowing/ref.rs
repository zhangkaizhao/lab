fn calculate_length(s: &String) -> usize {
    // The scope in which the variable s is valid is the same as any function parameter’s scope,
    // but we don’t drop what the reference points to when it goes out of scope because we don’t have ownership.
    // When functions have references as parameters instead of the actual values,
    // we won’t need to return the values in order to give back ownership, because we never had ownership.

    // We call having references as function parameters borrowing.
    // As in real life, if a person owns something, you can borrow it from them.
    // When you’re done, you have to give it back.

    s.len()
}

fn main() {
    let s1 = String::from("hello");

    // Note: The opposite of referencing by using & is dereferencing,
    // which is accomplished with the dereference operator, *.
    // We’ll see some uses of the dereference operator in Chapter 8 and discuss details of dereferencing in Chapter 15.

    // The &s1 syntax lets us create a reference that refers to the value of s1 but does not own it.
    // Because it does not own it, the value it points to will not be dropped when the reference goes out of scope.

    let len = calculate_length(&s1);

    println!("The length of '{}' is {}.", s1, len);
}
