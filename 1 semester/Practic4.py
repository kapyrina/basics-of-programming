# -*- coding: utf-8 -*-

# Задача1
print('Задача 1:')
def stringOperations():
    S = input('- ')
    iS = S[2]
    iiS = S[len(S) - 2]
    iiiS = S[0:5]
    ivS = S[0:len(S) - 3]
    vS = S[0::2]
    viS = S[1::2]
    viiS = S[::-1]
    viiiS = viiS[::2]
    ixS = len(S)
    print(iS)
    print(iiS)
    print(iiiS)
    print(ivS)
    print(vS)
    print(viS)
    print(viiS)
    print(viiiS)
    print(ixS)
    print("\n")
    return
print (stringOperations())

# Задача2
print('Задача 2:')
def count():
    S = input(' - ')
    print('Ответ:')
    print(S.count(' ') + 1)

print (count())

# Задача8
print('Задача 8:')
def rev():
    H = input(" - ")
    first = H.find("h")
    last = H.rfind("h")
    print("Ответ:")
    return H[0:first + 1] + H[first + 1:last][::-1] + H[last:]
print (rev())