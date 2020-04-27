n=int(input())
for i in range(n,0,-1):
    for j in range(n,0,-1):
        if(i+j==n+1):
            print("*",end="")
        else:
            print(j,end="")
    print("")
