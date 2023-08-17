print("*", "Задание 1.0", "*")
print("Введите число больше 7")
while True:
    user_data = int(input("Введите число: "))
    if user_data > 7:
        print("Привет")
    else:
        print("Не правильное число!")