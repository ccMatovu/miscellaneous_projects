public class test2 {
    public static void main(String[] args) {
        LinkedBag tests = new LinkedBag();
        tests.add(13);
        tests.add(333234);
        tests.add(93);
        tests.add(5533);
        tests.add(133);
        tests.add(869);
        tests.add(652);
        tests.add(343);
        LinkedBag result = (LinkedBag) tests.union(tests);
        System.out.println(tests.getCurrentSize());
        System.out.println(result.getCurrentSize());

        Object[] content = result.toArray();
        for(int i=0;i< content.length;i++){
            System.out.println(content[i]);
        }

    }
}
