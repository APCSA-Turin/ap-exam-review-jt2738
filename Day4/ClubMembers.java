import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setMemberList(ArrayList<MemberInfo> newList) {
        memberList = newList;
    }

    public void addMembers(String[] names, int gradYear) {
       for(int i=0; i< names.length;i++){
            MemberInfo newMem= new MemberInfo(names[i], gradYear, true);
            memberList.add(newMem);
       }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> retList= new ArrayList<MemberInfo>();
        for(int i=0; i<memberList.size();i++){
            if (memberList.get(i).getGradYear()<=year && memberList.get(i).inGoodStanding()) {
                retList.add(memberList.get(i));
            }
        }
        for(int i=0; i<memberList.size(); i++){
            if(memberList.get(i).getGradYear()<=year){
                memberList.remove(i);
                i--;
            }
        }
        return retList;
    }
}

