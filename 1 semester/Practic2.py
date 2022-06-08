# -*- coding: utf-8 -*-

# Задача3
print('Задача 3:')
def timeSinceStart():
    time = int(input('Количество минут:'))
    hours = time // 60
    minutes = time % 60
    return 'time : ' + str(hours % 24) + ':' + str(minutes)
print (timeSinceStart())
print ('\n')

# Задача5
print('Задача 5:')
def minOuttaThree():
    x = int(input())
    y = int(input())
    z = int(input())
    print('ответ:')
    return min(x,y,z)
print(minOuttaThree())
print('\n')

# Задача7
print('Задача 7:')
def isLeapYear():
    year = int(input('Год :'))
    print('Ответ:')
    if((year % 4 == 0 and year % 100 != 0) or year % 400 == 0):
        return 'Да'
    else:
        return 'Нет'
print(isLeapYear())
print("\n")