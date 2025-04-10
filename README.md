# JavaGuesser-

Creating a guessing game 

The player guessing game is randomly generated between a number 1-100.

The computer guessing game picks a number 1-100

Menu 
Creates and maintains Menu
	while true
		print quit
		print Human Guesser
		print Computer Guesser

		take input from user

		if the input equals 0
			print goodbye
			end while
		
		else if input is 1
			print Human Guesser
			Call Human()

		else if input is 2
			print Computer Guesser
			Call Computer()

		else 
			print invalid input

        
        
        
        
        
    Human(Scanner Input)
    
     public void Human()
	generate a random integer between 1 and 100
	print Try and guess the number between 1 and 100
	
	while true

		take input from the user

		try
			convert input string into an int
			if guess is less than random number
				print too low
			else if guess is greater than random number
				print too high
			else 
				print correct
				end while
		catch exception
			if guess equals q 
				end while loop
			else 
				print invalid input