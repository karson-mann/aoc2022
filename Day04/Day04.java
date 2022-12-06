class Day04 {

    public static void main(String[] args) {
        //new Day4().part1();
        new Day04().part2();
    }

    public void part1() {
        try (RandomAccessFile file = new RandomAccessFile("/home/ulrich/projects/aoc/2022/java/src/day4/input", "r")) {
            String str;

            int sum = 0;

            Pattern regex = Pattern.compile("([0-9]+)-([0-9]+),([0-9]+)-([0-9]+)");

            while ((str = file.readLine()) != null) {
                Matcher matcher = regex.matcher(str);

                if (matcher.find()) {
                    int elf1_left = parseInt(matcher.group(1)),
                            elf1_right = parseInt(matcher.group(2));
                    int elf2_left = parseInt(matcher.group(3)),
                            elf2_right = parseInt(matcher.group(4));

                    if ((elf1_left <= elf2_left && elf2_right <= elf1_right)
                            || (elf2_left <= elf1_left && elf1_right <= elf2_right)) {
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void part2() {
        try (RandomAccessFile file = new RandomAccessFile("/home/ulrich/projects/aoc/2022/java/src/day4/input", "r")) {
            String str;

            int sum = 0;

            Pattern regex = Pattern.compile("([0-9]+)-([0-9]+),([0-9]+)-([0-9]+)");

            while ((str = file.readLine()) != null) {
                Matcher matcher = regex.matcher(str);

                if (matcher.find()) {
                    int elf1_left = parseInt(matcher.group(1)),
                            elf1_right = parseInt(matcher.group(2));
                    int elf2_left = parseInt(matcher.group(3)),
                            elf2_right = parseInt(matcher.group(4));

                    // 5-7,7-9
                    // 2-6,4-8
                    // 6-6,4-6
                    // 2-6,4-8
                    if ((elf1_left <= elf2_right && elf1_right >= elf2_left)) {
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}