package com.nuanxinli.ai.vector;

public interface Vector {

	/**
	 * 本向量与另一个向量相加，返回新向量
	 * return a new vector, which equals this vector plus another one
	 * as the count of divisions is not certain, any two vectors can be calculated by this function
	 * @param vector 加向量 - another vector
	 * @return 两者之和组成的新向量 - sum vector
	 */
	public SparseVector plus(SparseVector vector);
	
	/**
	 * 本向量与另一个向量相加，并把结果保存到自身
	 * plus another vector to this vector, this vector will equal the sum vector after function called.
	 * as the count of divisions is not certain, any two vectors can be calculated by this function
	 * @param vector 加向量 - another vector
	 */
	public void plusSelf(SparseVector vector);
	
	/**
	 * 本向量与另一个向量相减，返回新向量
	 * return a new vector, which equals this vector minus another one
	 * as the count of divisions is not certain, any two vectors can be calculated by this function
	 * @param vector 减向量 - another vector
	 * @return 两者之差组成的新向量 - difference vector
	 */
	public SparseVector minus(SparseVector vector);
	
	/**
	 * 本向量与另一个向量相减，结果保存到自身
	 * this vector minus another one, this vector will equal the difference vector after function called.
	 * as the count of divisions is not certain, any two vectors can be calculated by this function
	 * @param vector 减向量 - another vector
	 */
	public void minusSelf(SparseVector vector);
	
	/**
	 * 本向量乘以一个常数，返回新向量
	 * return a new vector, which equals this vector multiply a constant
	 * @param factor 乘数 - the constant
	 * @return 两者之积组成的新向量 - the result vector
	 */
	public SparseVector multiply(double factor);
	
	/**
	 * 本向量乘以一个常数，结果保存到自身
	 * this vector multiply a constant, this vector will equal the product vector after function called.
	 * @param factor 乘数 - the constant
	 */
	public void multiplySelf(double factor);
	
	/**
	 * 本向量除以一个常数，返回新向量
	 * return a new vector, which equals this vector divide a constant
	 * @param divisor 除数 - divisor
	 * @return 两者之商组成的新向量 - the quotient vector
	 */
	public SparseVector divide(double divisor);
	
	/**
	 * 本向量除以一个常数，结果保存到自身
	 * this vector divide by a constant, this vector will equal the quotient vector after function called.
	 * @param factor 除数 - divisor
	 */
	public void divideSelf(double divisor);

	/**
	 * 计算本向量与指定向量的点积(标量积)
	 * calculate "dot product/scalar product" of this vector and another vector
	 * @param vector 指定向量 - another vector
	 * @return 点积值 - dot product value
	 */
	public double dotProduct(SparseVector vector);
	

	/**
	 * 求指定向量与本向量的距离平方, 其实也就是各个维度坐标差的平方和
	 * 因为求距离的话,还要把最后的平方和再开方一次, 如果只是用于比较大小, 得到距离平方就够了
	 * Get the square of distance between this vector and another one. 
	 * @param vector 指定向量(如果为空,表示0向量,则返回本向量的长度) - another vector(if is null, than return the square of length of this vector)
	 * @return 距离的平方 - the square of distance
	 */
	public double squareOfDistance(SparseVector vector);
	
	/**
	 * 求指定向量与本向量的距离
	 * Get the distance between this vector and another one. 
	 * @param  指定向量(如果为空,表示0向量,则返回本向量的长度) - another vector(if is null, then return the length of this vector)
	 * @return 距离 - the distance
	 */
	public double distance(SparseVector vector);
	
	/**
	 * 向量各个维度值的总和
	 * the sum on values of all divisions
	 * @param updateCache 是否强制更新缓存 - whether force to update cache
	 * 如果这个参数为true，表示无论以前是否计算过，强制根据各个维度的值重新计算长度，并写入缓存
	 * if true, then recalculate the length, and update cache
	 * 如果这个参数为false，那么会根据是否计算过这个值，来决定从缓存中获取长度，还是根据维度的值来计算长度
	 * if false, then get value from cache when existing, otherwise recalculate
	 * @return 维度值的总和 - the sum on values of all divisions
	 */
	public double sum(boolean updateCache);
		
	/**
	 * 向量长度(模)的平方
	 * the square of vector length(norm of vector)
	 * @param updateCache 是否强制更新缓存 - whether force to update cache
	 * 如果这个参数为true，表示无论以前是否计算过，强制根据各个维度的值重新计算长度，并写入缓存
	 * if true, then recalculate the length, and update cache
	 * 如果这个参数为false，那么会根据是否计算过这个值，来决定从缓存中获取长度，还是根据维度的值来计算长度
	 * if false, then get value from cache when existing, otherwise recalculate
	 * @return 长度的平方 - the square of vector length
	 */
	public double squareOfLength(boolean updateCache);
	
	/**
	 * 向量长度(模)的平方
	 * the square of vector length(norm of vector)
	 * @return 长度的平方 - the square of vector length
	 */
	public double squareOfLength();
	
	/**
	 * 向量长度(模)
	 * the vector length(norm of vector)
	 * @param updateCache 是否强制更新缓存 - whether force to update cache
	 * 如果这个参数为true，表示无论以前是否计算过，强制根据各个维度的值重新计算长度，并写入缓存
	 * if true, then recalculate the length, and update cache
	 * 如果这个参数为false，那么会根据是否计算过这个值，来决定从缓存中获取长度，还是根据维度的值来计算长度
	 * if false, then get value from cache when existing, otherwise recalculate
	 * @return 长度的平方 - vector length
	 */
	public double length(boolean updateCache);
	
	/**
	 * 向量长度(模)
	 * the vector length(norm of vector)
	 * @return 长度的平方 - vector length
	 */
	public double length();
	
	/**
	 * 余弦相似性
	 * 表达了两个向量在方向上的接近程度，或者说夹角的大小
	 * get cosine similarity, which show closing degree in direction
	 * @param vector - another vector
	 * @return 夹角的余弦值，余弦值的范围在[-1,1]之间，值越趋近于1，代表两个向量的方向越接近；越趋近于-1，他们的方向越相反；接近于0，表示两个向量近乎于正交；
	 * cosine similarity [https://en.wikipedia.org/wiki/Cosine_similarity]
	 */
	public double cosineSimilarity(SparseVector vector);
	
	/**
	 * 杰卡得相似性
	 * 表达了两个向量维度相似的程度, 等于两个向量维度交集的个数除以并集的个数
	 * get Jaccard similarity, which shows similarity of divisions, equals count of intersection set divides count of union set
	 * @param vector - another vector
	 * @return 维度相似度
	 * Jaccard similarity [https://en.wikipedia.org/wiki/Jaccard_index]
	 */
	public double jaccardSimilarity(SparseVector vector);
	
	/**
	 * 求与本向量(点)距离最近的向量(点)
	 * giving a set of vectors, find minimal distance between this vector and one of them, return the index of minimal one 
	 * @param vectors 一组要查找的向量 - a set of vectors
	 * @return 最接近向量(点)的索引 (在vectors中的index) - the index of the minimal one 
	 */
	public int nearest(SparseVector[] vectors);
}
