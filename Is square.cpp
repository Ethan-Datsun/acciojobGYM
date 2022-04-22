
#include <iostream>
using namespace std;
 

struct Point {
    int x, y;
};

int distSq(Point p, Point q)
{
    return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
}

bool isSquare(Point p1, Point p2, Point p3, Point p4)
{
    int d2 = distSq(p1, p2);
    int d3 = distSq(p1, p3); 
    int d4 = distSq(p1, p4); 
 
    if (d2 == 0 || d3 == 0 || d4 == 0)   
        return false;
 
    if (d2 == d3 && 2 * d2 == d4
        && 2 * distSq(p2, p4) == distSq(p2, p3)) {
        return true;
    }

    if (d3 == d4 && 2 * d3 == d2
        && 2 * distSq(p3, p2) == distSq(p3, p4)) {
        return true;
    }
    if (d2 == d4 && 2 * d2 == d3
        && 2 * distSq(p2, p3) == distSq(p2, p4)) {
        return true;
    }
 
    return false;
}
 

int main()
{ int x1,y1,x2,y2,x3,y3,x4,y4;
cin>>x1>>y1>>x2>>y2>>x3>>y3>>x4>>y4;
    Point p1 = { x1,y1 }, p2 = { x2,y2 },
          p3 = { x3,y3 }, p4 = { x4,y4 };
    isSquare(p1, p2, p3, p4) ? cout << "Yes" : cout << "No";
    return 0;
}