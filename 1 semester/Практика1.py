# -*- coding: utf-8 -*-
# Задача2
print ('Задание 2:')
print (16823 * 12302 % 3092)
# Задача4
print ('Задание 4:')
def time(seconds):
    fullTime = str(seconds // 86400) + ":" + str(seconds % 86400 // 3600) + ":" + str(seconds % 3600 // 60) + ":" + str(seconds % 3600 % 60)
    return fullTime
print(time(100000))
# Задача7
print ('Задание 7:')
def isEven(number):
    if(number%4 == 0):
        return('число чётное')
    else:
        return('число нечётное')
print (isEven(4))
print (isEven(5))