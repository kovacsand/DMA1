package Sets;

import java.util.HashSet;

public class sets
{
  public HashSet<String> union(HashSet<String> set1, HashSet<String> set2)
  {
    HashSet<String> set = new HashSet<>();

    for (String temp : set1)
      if (!set.contains(temp))
        set.add(temp);
    for (String temp : set2)
      if (!set.contains(temp))
        set.add(temp);

    return set;
  }

  public HashSet<String> intersection(HashSet<String> set1,
      HashSet<String> set2)
  {

    HashSet<String> set = new HashSet<>();

    for (String temp : set1)
      if (set2.contains(temp))
        set.add(temp);

    return set;
  }

  public static HashSet<String> relativeComplement(HashSet<String> set1,
      HashSet<String> set2)
  {
    HashSet<String> set;

    set = set1;
    for (String temp : set2)
      if (set1.contains(temp))
        set.remove(temp);

    return set;
  }

  public boolean isASubSet(HashSet<String> set1, HashSet<String> set2) {
    for (String temp : set1)
      if (!set2.contains(temp))
        return false;
    return true;
  }

  public boolean isProperSubSet(HashSet<String> set1, HashSet<String> set2) {
    return isASubSet(set1, set2) && !set1.equals(set2);
  }
}
