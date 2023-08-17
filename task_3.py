print("*", "Задание 3.0", "*")

array = [1, 2, 3, 4, 5, 15, 18, 21, 24, 27, 30]
array_result = []

for num in array:
    if num % 3 == 0:
        array_result.append(num)

print(", ".join(map(str,array_result)))
input() # Защита от закрытия консоли