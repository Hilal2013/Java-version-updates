package com.cydeo.socialNetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Member member1 = new Member("Mary", 30, Gender.FEMALE);
        Member member2 = new Member("John", 20, Gender.MALE);
        Member member3 = new Member("Julia", 19, Gender.FEMALE);
        Member member4 = new Member("Mike", 32, Gender.FEMALE);
        Member member5 = new Member("David", 18, Gender.MALE);
        list.addAll(Arrays.asList(member1, member2, member3, member4, member5));
        System.out.println(list);
checkMemberPredicate checkMale=member->
    member.getGender().equals(Gender.MALE) && member.getAge()>=18 && member.getAge()<=25;

    sendMessage(list,checkMale);
    //[Member{name='John', age=20, gender=MALE}, Member{name='David', age=18, gender=MALE}]

    }

    private static void sendMessage(List<Member> list, checkMemberPredicate member) {
        List<Member> result = new ArrayList<>();
        for (Member each : list) {
            if (member.check(each)) {
                result.add(each);
            }
        }
        System.out.println(result);
    }

}
