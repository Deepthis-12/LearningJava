1) To read data from keyboard use 
   - Scanner scanner = new Scanner(System.in);
     - String name = scanner.next(); or 
     - int age = scanner.nextInt() or 
     - double height = scanner.nextDouble() or
     - boolean b = scanner.nextBoolean()
   - .next() reads only one token or word at a time. To read the whole line use scanner.nextLine();
   - To read "John Cater", we need to use scanner.next() twice to read words or use scanner.nextLine()
2) Use System.out.format() to format the text for printing
   - Eg: System.out.format("Hello %s, your age is %d and you are %.2f tall", name, age, height)
3) 