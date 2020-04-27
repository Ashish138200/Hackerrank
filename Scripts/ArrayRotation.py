n=int(input())
x=input()
ori=list(x.split(" "))
z=len(ori)
rep=ori.copy()
rep.sort()
b=int(rep[0])
for i in range(0,z):
    a=int(ori[i])
    if(a==b):
        print(i)
        break