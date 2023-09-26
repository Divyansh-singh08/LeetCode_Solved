<h2><a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Amazon</font></font></div><div class="companyTagsContainer--tagOccurence"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">2</font></font></div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">1295</font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">. </font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Find Numbers with Even Number of Digits</font></font></a></h2><h3>Easy</h3><hr><div><p><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Given an array </font></font><code>nums</code><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> of integers, return how many of them contain an </font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">even number</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> of digits.</font></font></p>

<p>&nbsp;</p>
<p><strong class="example"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Example 1:</font></font></strong></p>

<pre><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Input:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> numbers = [ 12,345,2,6,7896 ]
</font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Output:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> 2
</font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Explanation: 
</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">12 containers 2 digits ( even number of digits ).&nbsp;</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
345 containers 3 digits ( odd number of digits ).&nbsp;</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
2 containers 1 digit ( odd number of digits ).&nbsp;</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
6 containers 1 digit ( odd number of digits ).&nbsp;</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
7896 contains 4 digits ( even number of digits ).&nbsp;</font></font><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
Therefore only 12 and 7896 contain an even number of digits.</font></font><font></font>
</pre>

<p><strong class="example"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Example 2:</font></font></strong></p>

<pre><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Input:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> numbers = [ 555,901,482,1771 ]
</font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Output:</font></font></strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"> 1 
</font></font><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Explanation: </font></font></strong><font></font><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
Only 1771 contains an even number of digits.</font></font><font></font>
</pre>

<p>&nbsp;</p>
<p><strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Constraints:</font></font></strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 500</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>
</div>