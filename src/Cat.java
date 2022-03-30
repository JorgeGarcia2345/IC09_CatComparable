
// Comparable interface - determines the sort order of classes
/*

public interface Comparable
{
  public int CompareTo(
}

  // MUST use ALL METHOD IN INTERFACE
*/

public class Cat implements Comparable <Cat>
{
	
  private String mName;
  private String mBreed;
  private int mAge;

  public Cat(String name, String breed, int age) {
    mName = name;
    mBreed = breed;
    mAge = age;
  }

  @Override
  public String toString() {
    return "Cat [Name=" + mName + ", Breed=" + mBreed + ", Age=" + mAge + ", Human Age=" + ageInHumanYears() + "]";
  }

  public int ageInHumanYears() {
    if (mAge == 1)
      return 15;
    else if (mAge == 2)
      return 24;
    else
      return 24 + (mAge - 2) * 4;
  }


  // 1st cat is (this)
  @Override                // 2nd cat
  public int compareTo(Cat other)
  {
    // compare cats first by  AGE - int
    int ageComp = this.mAge - other.mAge;

    if (ageComp != 0)
      return ageComp;

    // then compare by        NAME - String

    //int nameComp = this.mName.toLowerCase().compareTo(other.mName.toLowerCase());
    int nameComp = this.mName.compareToIgnoreCase(other.mName);
    if(nameComp != 0)
      return nameComp;

    // then by                BREED - String
    /*
    int breedComp = this.mBreed.compareTo(other.mBreed);
    if(breedComp != 0)
    // NO NEED JUST PROCESS LAST METHOD!!!!
    // LAST COMP CHECK - Comparison
     */
      return this.mBreed.compareTo(other.mBreed);
  }
}