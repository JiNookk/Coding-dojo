import java.util.Arrays;
import java.util.stream.Collectors;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int count = 0;

        for (String skillTree : skill_trees) {
            count += validateSkillTree(skill, skillTree) ? 1 : 0;
        }

        return count;
    }

    public boolean validateSkillTree(String skill, String skill_tree) {
        String filtered = filter(skill, skill_tree);

        String trimmed = trim(skill, filtered);

        return trimmed.equals(filtered);
    }

    public String filter(String skill, String skill_tree) {
        return Arrays.stream(skill_tree.split(""))
                .filter(skill::contains)
                .collect(Collectors.joining());
    }

    private String trim(String skill, String filtered) {
        return skill.substring(0, filtered.length());
    }
}
