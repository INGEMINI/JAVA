. What is Collections Framework?
A standardized API to store and manipulate groups of objects.

Found in the package:

import java.util.\*;

---

// 🌟 Major Interfaces in Java Collections Framework

/*
Interface             Description
----------------------------------------------------------
Collection            Root interface (extended by List, Set, Queue)
List                  Ordered collection (duplicates allowed)
Set                   No duplicates allowed
Queue                 Ordered for processing (FIFO or LIFO)
Map                   Key-value pairs (Not part of Collection interface)
*/
---

hierarchy diagram 

               Collection
               /   |    \
          List  Set  Queue
                    |
                  Deque

             Map (separate)

---
some classes
list(arraylist,linkedlist)
set(hashset,linkedhashset,treeset)
queue(priorityqueue,arraydeque)
map(hashmap,linkedhashmap,treemap,hashtable)

---
Collections can only hold objects, so primitives like int, char are wrapped:

Primitive	Wrapper
int	Integer
char	Character
double	Double

---
🔍 Why is List needed as a separate interface when we already have ArrayList and LinkedList?
Let’s break this down:

✅ 1. List is a Super Type (Interface)
List is an interface.

ArrayList and LinkedList are classes that implement the List interface.