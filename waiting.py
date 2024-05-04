import random
import time

print("Welcome to the waiting game!")
target = random.randint(2,8)
print("Your target time is", target, "seconds.")
input(" --- Press enter again after " + str(target) + " seconds --- ")
start = time.time()
input(" --- Press enter to stop the timer --- ")
end = time.time()
elapsed = end - start
print("Elapsed time:",elapsed, "seconds")
if elapsed == target:
    print("Wow! Perfect timing!")
elif elapsed < target:
    print("You were", target-elapsed, "seconds too fast!")
else:
    print("You were", elapsed-target, "seconds too slow!")  


