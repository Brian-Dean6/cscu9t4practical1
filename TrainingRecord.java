// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
	private Entry[] entries;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String getAllEntriesOnDate(int day, int month, int year) {
	    String message = "";
	    ArrayList<Entry> entriesOnDate = new ArrayList<>();
	    for (Entry e : entriesOnDate) {
	        if (e.getDay() == day && e.getMonth() == month && e.getYear() == year) {
	            entriesOnDate.add(e);
	        }
	    }
	    if (entriesOnDate.size() > 0) {
	        for (Entry e : entriesOnDate) {
	            message += e.toString() + "\n";
	        }
	    } else {
	        message = "No entries found on this date.\n";
	    }
	    return message;
	}
   
   public void removeEntry(String n, int d, int m, int y) {
       ListIterator<Entry> itr = tr.listIterator();
       boolean removed = false;
       while (itr.hasNext()) {
           Entry current = itr.next();
           if (current.getDay() == d && current.getMonth() == m && current.getYear() == y && current.getName().equals(n)) {
               itr.remove();
               System.out.println("Successful");
               removed = true;
               break;
           }
       }
       if (!removed) {
           System.out.println("Failed");
       }
   }
   public String findAllByDate(int d, int m, int y) {
	    StringBuilder sb = new StringBuilder();
	    for (Entry e : entries) {
	        if (e.getDay() == d && e.getMonth() == m && e.getYear() == y) {
	            sb.append(e.toString()).append("\n");
	        }
	    }
	    if (sb.length() == 0) {
	        sb.append("No records found on "+d+"/"+m+"/"+y);
	    }
	    return sb.toString();
	}
   
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
 }
                    // TrainingRecord