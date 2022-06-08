# -*- coding: utf-8 -*-

# Задача1
print('Задача 1:')
def squareUp():
    i = 1
    N = int(input(' - '))
    while i * i <= N:
        print(i * i)
        i+=1

squareUp()

# Задача3
print('Задача 3:')
def powFinder():
    i = 2
    powContainer = 2
    counter = 1
    n = int(input(' - '))

    while powContainer * i < n:
        powContainer *= i
        counter+=1
    print(powContainer)
    print(counter)
print (powFinder())