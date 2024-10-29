import random

def play_number_game():
    score = 0
    rounds = 0

    while True:
        # Generate a random number between 1 and 100
        target_number = random.randint(1, 100)
        attempts = 0
        max_attempts = 10  # Limit the number of attempts
        print("\nA random number between 1 and 100 has been generated.")
        print(f"You have {max_attempts} attempts to guess the number.")

        while attempts < max_attempts:
            try:
                guess = int(input(f"Attempt {attempts + 1}: Enter your guess: "))
            except ValueError:
                print("Please enter a valid number.")
                continue
            
            attempts += 1

            if guess < target_number:
                print("Too low!")
            elif guess > target_number:
                print("Too high!")
            else:
                print(f"Congratulations! You've guessed the number {target_number} in {attempts} attempts.")
                score += (max_attempts - attempts + 1)  # Score based on attempts
                break

        if attempts == max_attempts:
            print(f"Sorry! You've used all attempts. The number was {target_number}.")

        rounds += 1
        play_again = input("Do you want to play another round? (yes/no): ").strip().lower()
        if play_again != 'yes':
            break

    print(f"\nGame Over! You played {rounds} rounds and scored {score} points.")

if __name__ == "__main__":
    play_number_game()
