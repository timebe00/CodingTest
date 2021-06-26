#문자열 다루기 기본

import re

def solution(s):
    print(len(s))
    if(len(s) == 4 or len(s) == 6):
        change = re.sub('\d+','a',s)
        print(len(change))
        if(len(change) == 1):
            return True
        else:
            return False
    return False