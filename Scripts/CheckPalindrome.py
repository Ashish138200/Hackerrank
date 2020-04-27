s=input()
def isPal(s):
    rev=s[::-1]
    if(s==rev):
        return True
    return False
ans= isPal(s)
if (ans==1):
    print('true')
else:
    print('false')