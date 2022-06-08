# -*- coding: utf-8 -*-

# Задача4
print('Задача 4:')
def sumN():
    sum = 0
    for i in range(int(input('количество чисел :'))):
        sum += int(input('число :'))
    print('Ответ:')
    return sum
print(sumN())

# Задача6
print('Задача 6:')
def factorial():
    n = int(input('число :'))
    sum = 1
    for i in range(1, n + 1):
        sum *= i
    print('ответ:')
    return sum

print(factorial())