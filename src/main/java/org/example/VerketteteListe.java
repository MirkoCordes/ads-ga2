package org.example;

public class VerketteteListe {
    //TODO add 'VerketteteListe "head"' as variable for two-way chained list
    //TODO change 'String head' to generic Type and name it to 'value'
    private String head;
    private VerketteteListe trail;

    public VerketteteListe(String head) {
        this.head = head;
    }

    public VerketteteListe(String head, VerketteteListe trail){
        this.head = head;
        this.trail = trail;
    }

    public String listFirst() {
        return head;
    }

    public VerketteteListe listSearch(String k) {
        if(head != null && !head.equals(k)) {
            return trail.listSearch(k);
        }
        return new VerketteteListe(head, trail);
    }

    public void listInsertFirst(String x) {
        trail = new VerketteteListe(this.head, this.trail);
        head = x;
    }

    public void listInsertLast(String x) {
        if(trail != null) {
            trail.listInsertLast(x);
        } else {
            trail = new VerketteteListe(x);
        }
    }

    public void listDelete(String x) {
        VerketteteListe listToDelete = listSearch(x);
        if(listToDelete.trail != null) {
            //TODO get trail obj and paste in position of connected listToDeleted obj
        }
    }
}
