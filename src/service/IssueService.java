package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Exam Appeal", 2));
        issues.add(new Issue("Scholarship Problem", 1));
        issues.add(new Issue("Course Registration Error", 3));
        issues.add(new Issue("Missing Grades", 2));
        issues.add(new Issue("Graduation Clearance", 1));

        issues.poll();
        issues.poll();
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (issues.isEmpty()) {
            System.out.println("No issues available.");
        } else {
            System.out.println("Most Urgent Issue:");
            System.out.println(issues.peek()); // peek НЕ удаляет
        }
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        if (issues.isEmpty()) {
            System.out.println("No issues to resolve.");
            return;
        }

        System.out.println("Resolving issues...");

        for (int i = 0; i < 2; i++) {
            if (!issues.isEmpty()) {
                System.out.println("Resolved: " + issues.poll()); // poll удаляет
            }
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        if (issues.isEmpty()) {
            System.out.println("No remaining issues.");
            return;
        }

        System.out.println("Remaining Issues:");

        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgency));
        System.out.println("New issue added successfully.");
    }

}
