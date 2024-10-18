/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Member implements Comparable<Member> {
    private int memberId;
    private String name;
    private String membershipType;

    // Constructor
    public Member(int memberId, String name, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
    }

    // Getter for memberId
    public int getMemberId() {
        return memberId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for membershipType
    public String getMembershipType() {
        return membershipType;
    }

    // Override toString to display member details
    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name + ", Membership Type: " + membershipType;
    }

    // Implement compareTo to compare members by name for sorting
    @Override
    public int compareTo(Member other) {
        return this.name.compareTo(other.name);
    }

    // Override equals and hashCode to ensure no duplicate members in the set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(memberId);
    }
}
