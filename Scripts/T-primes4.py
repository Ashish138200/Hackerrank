#one test case failed
n=int(input())
x=input()
l=list(x.split())
for i in range(0,n):
    l[i]=int(l[i])
c=0
for i in range(0,n):
    for j in range(1,l[i]+1):
        if(l[i]%j==0):
            c=c+1
    if(c==3):
        print("YES")
    else:
        print("NO")
    c=0
'''
perSq=0
prime=0
for i in l:
    root = i**0.5
    if int(root + 0.5) ** 2 == i:
        perSq=i
    for j in range(2,i):
        if(i%j==0):
            prime=0
        else:
            prime=i
    if(perSq==prime):
        print("YES")
    else:
        print("NO")
        '''