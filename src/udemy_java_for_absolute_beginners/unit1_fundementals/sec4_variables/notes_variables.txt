 1) There are different primitive variable types
  - byte,short,int,long for Integer Types
  - float,double for decimal types
  - boolean for true/false
  - char for Character types

 String is object type and not primitive types
2) Type casting from small dataTypes to big dataType is called implicit casting
for example: int a=10;
             long b=a;

Type casting from big dataType to small dataTypes is called explicit casting. If typecasting not done,
compilation error comes which says loss of precision

for example: long a = 10;
             int b = (int) a;

Remember analogy of basket and ball. A small ball can implicitly be thrown to big basket and need to explicitly
know when throwing big ball to small basket.
