#include <iostream>
#include "pers_desperado_demo_Demo.h"

using namespace std;

JNIEXPORT void JNICALL
Java_pers_desperado_demo_Demo_hello(JNIEnv
                                    *, jclass) {
    cout << "Hello" << endl;
}