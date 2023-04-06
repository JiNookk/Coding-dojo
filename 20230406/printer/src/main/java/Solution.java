//- 각각의 숫자를 객체로 래핑 (인덱스, 수)
//- 링크드리스트를 이용해서 앞 -> 뒤로 이동하는 메서드 구현
//- 링크드 리스트의 모든 요소를 비교한뒤 본인보다 큰 수가 있는지 판별
//- location과 인덱스가 일치하는지 비교

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class Document{
    private final int initialIndex;
    private final int priority;

    public Document(int initialIndex, int priority) {
        this.initialIndex = initialIndex;
        this.priority = priority;
    }

    public boolean isPriorityLessThan(Document document) {
        return this.priority < document.priority;
    }

    public boolean isWeWant(int location) {
        return this.initialIndex == location;
    }
}

public class Solution {
    public int solution(int[] priorities, int location) {
        Deque<Document> documents = new LinkedList<>();
        Stack<Document> printedStack = new Stack<>();

        for (int i = 0; i < priorities.length; i += 1) {
            Document document = new Document(i, priorities[i]);

            documents.add(document);
        }

        while (printedStack.isEmpty() || !printedStack.peek().isWeWant(location)) {
            if (isBiggest(documents)) {
                Document biggest = documents.pollFirst();
                printedStack.push(biggest);
                continue;
            }

            rotate(documents);
        }

        return printedStack.size();
    }

    public boolean isBiggest(Deque<Document> documents) {
        boolean isBiggest = true;
        Document first = documents.getFirst();

        for (Document document : documents) {
            if (first.isPriorityLessThan(document)) {
                isBiggest = false;
                break;
            }
        }

        return isBiggest;
    }

    public void rotate(Deque<Document> documents) {
        Document first = documents.poll();
        documents.addLast(first);
    }
}
