#include <iostream>
#include <climits>

using namespace std;
int main()
{
    unsigned short s = USHRT_MAX;
    std::cout << "short = "<< s << std::endl;
    s++;
    std::cout << "short = "<< s << std::endl;

    return 0;
}
