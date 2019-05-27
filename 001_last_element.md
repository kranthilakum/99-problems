## Write a function that returns the last element of a list.**

**JavaScript**

```javascript
> const lastElement = (elements) => {
	if (elements === undefined) {
		return null;
	}
	if (Array.isArray(elements)) {
    return elements[elements.length-1];
	}
}
> lastElement()
null
> lastElement(undefined)
null
> lastElement([1])
1
> lastElement([1, 2, 3, 4, 5])
5
> lastElement({'a': 2})
undefined
```

**Java**

```java
class Main {
  public static int lastElement(int[] intArray) {
    int result = 0;
    if (intArray.length !=0) {
      result = intArray[intArray.length - 1];
    }
    return result;
  }
  public static void main(String[] args) {
    int[] intArray = new int[]{1, 2, 3, 4, 5};
    System.out.println("Last element: " + lastElement(intArray));
  }
}
```

**Python**

```python
def lastElement(elements):
    if isinstance(elements, type(elements)) and len(elements) == 0:
	return 0
    else:
	return elements[len(elements) - 1]
```

**OCaml**

```ocaml
# let rec last = function
    | [] -> None
    | [x] -> Some x
    | _ :: t -> last t;;      
val last : 'a list -> 'a option = <fun>

# last([]);;
- : 'a option = None
# last([1]);;
- : int option = Some 1
# last([1; 2; 3]);;
- : int option = Some 3
```

**Scala**

```scala
@ def lastElement(elements: List[Int]): Int = elements.last 
defined function lastElement
@ lastElement(List(1, 2, 3, 4, 5))
res5: Int = 5

// Another definition
@ def lastElement(elements: List[Int]) = elements match {
  case Nil => None
  case x :: Nil => Some(x)
  case x :: rest => rest.last
}

@ lastElement(List()) 
Any = None

@ lastElement(List(1, 2, 3)) 
Any = 3

@ lastElement(List(1)) 
Any = Some(1)
```
