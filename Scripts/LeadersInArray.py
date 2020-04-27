n=int(input())
x=input()
ori=list(x.split(" "))
z=len(ori)
for i in range(0,z):
    ori[i]=int(ori[i])
f=0
for i in range(0,z):
    a=ori[i]
    for j in range(i,z):
        b=ori[j]
        if(a<b):
            f=1
            break
    if(f==0):
        print(a,"",end="")
    f=0