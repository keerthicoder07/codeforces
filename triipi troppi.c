#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    char str[100];
    
    for (int i = 0; i < n; i++) {
        scanf(" %[^\n]", str); 

        printf("%c", str[0]);

        for (int l = 1; str[l] != '\0'; l++) {
            if (str[l-1] == ' ' && str[l] != ' ') {
                printf("%c", str[l]); 
            }
        }
        printf("\n"); 
    }
    return 0;
}
