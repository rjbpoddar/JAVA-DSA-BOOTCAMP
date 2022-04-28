public class Largest {
    public static void main(String[] args){
        System.out.println();

    }
    nction largestNumber(nums: number[]): string {
        const strings = nums.map(n => n.toString());
        strings.sort(sort);
        
        return strings.join('').trim();
      };
      
      function sort(a: string, b: string): number {
        const n1 = a.length;
        const n2 = b.length;
        let i1 = 0;
        let i2 = 0;
        
        while(i1 < n1 || i2 < n2) {
          if (i1 === n1) i1 = 0;
          if (i2 === n2) i2 = 0;
          if (a[i1] !== b[i2]) return +b[i2] - +a[i1];
          i1++;
          i2++;
        }
        
        return 0;
      }
}
