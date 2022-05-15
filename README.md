# Generic Sorted Linked List
## Deadline: 16.05.2022 8:00
## Implementation
Your task is to implement a sorted linked list. The elements must
be inserted at the correct position. Inserting at the last position
and sorting afterwards **is not** allowed.

A basic skeleton is already provided. The generic interface
`SortedList` is the base of your implementation. Therefore, 
`SortedLinkedList` must implement it. Do not use raw types.
`SortedLinkedList` should also implement a good-looking `toString()`
method.

An output example could be:
~~~
| a | ->| b | ->| g | ->| x | ->| z | 
~~~

The goal is to have a list which can work with all comparable
objects.

## Testing
Test your implementation intensively. Try out corner cases. 
Test all your methods = 100% code coverage.
Your implementation must care of error handling. Moreover, test
it with at least three different classes.
* One of them should be String.
* Two self written classes which are comparable. Small classes are
totally fine.
  
## Questions
* How can you change the ordering of the list? From ascending 
to descending. Name at least two different methods.
---
Put a - before the comparison in the return statement in the compareTo method.

Write a different sorting method.

---
* Can the inner Node class be static? Justify your answer.
---
No, because then it wouldn't be an inner class anymore, but a nested class.


---
* Can you name the generic placeholder `Placeholder` instead of
`T`? If yes should you, do it?
---
Yes you can, but you should give it a name that makes more sense in the context of the code.

---
* Which benefits does this data structure have?
---
It doesn't have a fixed size like arrays, so we can control how much memory it allocates at all times.

It is also available in pre-made form in java, so we don't have to code it ourselves every time we need it. 

---
* Which drawbacks does it have? Name a use case.
---
You always have to iterate through the list to find elements at an index.
You have to write a method to get an element instead of easily accessing it like in arrays.

---
* Will the following class compile? If not, why?

~~~java
public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}
~~~
---
No, because the > and < operators won't work with objects.

---
* If the compiler erases all type parameters at compile time, why should you use generics?
---
Because the compiler will check types more strictly at compile time, making it more likely for an error to be caught before running the program.

---
* Consider this class:

~~~java
class Node<T> implements Comparable<T> {
    public int compareTo(T obj) { /* ... */ }
    // ...
}
~~~

Will the following code compile? If not, why?

~~~java
Node<String> node = new Node<>();
Comparable<String> comp = node;
~~~
---
Yes it will compile, because they are both set to accept Strings.


---
* Write a generic method to exchange the positions of two different elements in an array

---
~~~java
public static <T> void switch(T[] arr, int index, int index2){
        T temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;

}
~~~



> **NOTES:**
Write readable and good code. Do not repeat yourself use final,
static and access modifiers accordingly. Do not forget equals methods
for your own classes.
