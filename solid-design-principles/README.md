# SRP (Single Responsibility Principle)

- A class should have a just a single reason to change single class should have one primary
 responsibility instead of taking lots and lots of responsibilities.
- If we take lots of responsibilities, then we end up with a GOD Object (which is an ANTI-PATTERN)
- Sometimes, we tend to add stuff to a class, which feels good to have. But, the object is doing more 
than what is required. The responsibility can be delegated to some other object.
- Which will make the class more test-able
- So, if we try to add functions like saveToAFile, loadFromAFile, loadFromAUrl. Then we are just introducing new concerns. 
Ideally when are class is deviating from "primary" responsibility. We should think about separation of concern.

