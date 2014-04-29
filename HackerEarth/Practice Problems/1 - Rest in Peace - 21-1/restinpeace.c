#include <stdio.h>
#include <stdlib.h>

void process(int argc, char **argv);

int main(int argc, char **argv) {
    if(argc <= 1) {
        printf("%s", "Need more arguments.");
    } else {
        process(argc, argv);    
    }
    return 0;
}

void process(int argc, char **argv) {
    char *t_char = argv[1];
    int t = atoi(t_char);
}
