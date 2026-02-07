package month_02.day_02_07;

import java.util.Optional;

public class OptionalPractice2 {
    static class User {
        private final Address address;

        public User(Address address) {
            this.address = address;
        }

        public Optional<Address> getAddress() {
            return Optional.ofNullable(address);
        }
    }

    static class Address {
        private final String zipCode;

        public Address(String zipCode) {
            this.zipCode = zipCode;
        }

        public Optional<String> getZipCode() {
            return Optional.ofNullable(zipCode);
        }
    }

    // 우편번호 가져오기
    public static String getZipCode(User user) {
        return Optional.ofNullable(user)
                .flatMap(User::getAddress)
                .flatMap(Address::getZipCode)
                .orElse("우편번호 없음");
    }

    public static void main(String[] args) {
        User user1 = new User(new Address("12345"));
        User user2 = new User(new Address(null));
        User user3 = new User(null);

        System.out.println(getZipCode(user1));
        System.out.println(getZipCode(user2));
        System.out.println(getZipCode(user3));

    }
}
