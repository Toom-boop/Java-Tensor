# Tensor
## Create Tensor
```JAVA
Tensor tensor = new Tensor();
```
***
## Set
```JAVA
//sets 1.2 to position 5,2
tensor.set(5, 2, 1.2);
```
***
## Get
```JAVA
//returns value at position 5, 2
tensor.get(5, 2);
```
***
## Add
```JAVA
Tensor a = new Tensor();
Tensor b = new Tensor();
Tensor c = a.add(b);
```
***
## Substract
```JAVA
Tensor a = new Tensor();
Tensor b = new Tensor();
Tensor c = a.subtract(b);
```
***
## Multiply
```JAVA
Tensor a = new Tensor();
Tensor b = new Tensor();
Tensor c = a.multiply(b);
```
***
## Divide
```JAVA
Tensor a = new Tensor();
Tensor b = new Tensor();
Tensor c = a.divide(b);
```
***
## Transpose
```JAVA
Tensor a = new Tensor();  //{{1.0, 2.0}, {3.0, 4.0}}
Tensor b = a.transpose(); //{{1.0, 3.0}, {2.0, 4.0}}
```
