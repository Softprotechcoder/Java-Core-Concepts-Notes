# Comparable / compareTo / TimSort Quick Cheat Sheet

## 1) Start of execution

```java
List<Student> students = new ArrayList<>();
students.add(new Student("Alice", 85));
students.add(new Student("Bob", 92));
students.add(new Student("Charlie", 78));

Collections.sort(students);
```

Flow:

```text
main() starts
   |
   v
create objects
   |
   v
put them in list
   |
   v
Collections.sort(students)
   |
   v
Java sort engine starts
```

---

## 2) What `Comparable` means

```java
class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }
}
```

This means:

- this class defines its natural ordering
- Java can compare two `Student` objects

---

## 3) What `compareTo()` returns

```java
int result = a.compareTo(b);
```

Meaning:

- negative => `a` comes before `b`
- zero => equal
- positive => `a` comes after `b`

Example:

```java
Alice(85).compareTo(Bob(92)) = 85 - 92 = -7
```

Result = `-7` => Alice should come before Bob.

---

## 4) Who receives return value?

The sorting algorithm in the JDK receives it.

It does:

```java
if (result < 0) {
    // a before b
} else if (result > 0) {
    // a after b
} else {
    // equal
}
```

Important:

- your `main()` method does not directly receive the result
- the JDK sort engine uses it internally

---

## 5) Real flow

```text
Collections.sort(list)
    -> Java sorting algorithm (TimSort)
    -> compare two elements
    -> call a.compareTo(b)
    -> get return value
    -> decide swap / keep / merge
    -> list becomes sorted
```

---

## 6) Your example in one line

```java
Alice(85).compareTo(Bob(92)) => -7
Bob(92).compareTo(Charlie(78)) => 14
```

Final sorted order:

```text
[Charlie(78), Alice(85), Bob(92)]
```

---

## 7) TimSort in Java 21

TimSort is the algorithm Java uses for sorting object lists.

It works like this:

1. finds sorted runs in the list
2. sorts those small runs
3. merges them together
4. during merge, compares values using `compareTo()`

So the real sorting is:

```text
TimSort -> compare pairs -> compareTo() -> result -> merge/swap -> sorted list
```

---

## 8) Why this is important

Because `compareTo()` defines the ordering rule.

The sort algorithm only needs a consistent answer:

- smaller than
- equal to
- greater than

That answer is enough to sort the whole list.

---

## 9) Best practice

Use this:

```java
return Integer.compare(this.marks, other.marks);
```

instead of this:

```java
return this.marks - other.marks;
```

because subtraction can overflow for big values.

---

## 10) Final memory line

```text
Comparable -> compareTo() -> returns int -> sorting engine uses it -> TimSort reorders list
```

---

## 11) One sentence summary

`compareTo()` is the ordering rule, and Java’s TimSort repeatedly calls it to decide which element must come before another until the list is fully sorted.
