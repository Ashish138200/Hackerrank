s1=int(input())
a=input()
s2=int(input())
b=input()
l1=list(a.split(" ")) * (s1+s2)
l2=list(b.split(" ")) * (s1+s2)
if(s1>=s2):
    for i in range(0,s1):
        for j in range(0,s2):
            if(l1[i]==l2[j]):
                print(l1[i])
else:
    x=s2-s1
    for i in range(0,s2-x):
        for j in range(0,s1):
            if(l1[i]==l2[j]):
                print(l1[i])

